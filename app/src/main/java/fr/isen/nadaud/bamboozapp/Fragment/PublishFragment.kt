package fr.isen.nadaud.bamboozapp.Fragment

import android.R.attr.bitmap
import android.app.Activity.RESULT_OK
import android.content.ContentUris
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Color
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import android.net.Uri
import android.os.Bundle
import android.provider.DocumentsContract
import android.provider.MediaStore
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import fr.isen.nadaud.bamboozapp.R
import fr.isen.nadaud.bamboozapp.databinding.FragmentPublishBinding


class PublishFragment : BamboozFragment() {
    lateinit var binding: FragmentPublishBinding

    val Image_Capture_Code = 99
    val OPERATION_CHOOSE_PHOTO = 98

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentPublishBinding.inflate(layoutInflater, container, false)

        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setOnClick()
    }
    fun setOnClick(){
        //Make actions
        binding.importPic.setOnClickListener(View.OnClickListener { view ->
            val intent = Intent("android.intent.action.GET_CONTENT")
            intent.type = "image/*"
            startActivityForResult(intent, OPERATION_CHOOSE_PHOTO)
        })
        binding.takePic.setOnClickListener(View.OnClickListener { view ->
            //Start Camera
            val cInt = Intent(MediaStore.ACTION_IMAGE_CAPTURE)
            startActivityForResult(cInt, Image_Capture_Code)
        })
    }




    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if (requestCode == Image_Capture_Code) {
            if (resultCode == RESULT_OK) {
                val bp = data?.extras!!["data"] as Bitmap?
                if(bp != null){
                    binding.preview.background = null
                    binding.preview.setImageBitmap(bp)
                    binding.tv.visibility = View.INVISIBLE
                }
            }
        }else if(requestCode == OPERATION_CHOOSE_PHOTO){
            if (resultCode == RESULT_OK) {
                binding.preview.background = null

                val imageUri = data?.data
                binding.preview.setImageURI(imageUri)
                binding.tv.visibility = View.INVISIBLE
            }
        }
    }
}