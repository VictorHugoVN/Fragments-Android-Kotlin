package com.example.trabalho_fragments

import android.graphics.Color
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.annotation.ColorInt
import androidx.recyclerview.widget.RecyclerView
import com.example.trabalho_fragments.model.Email

class EmailAdapter(val emails: MutableList<Email>) : RecyclerView.Adapter<EmailAdapter.EmailViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EmailViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false)
        return EmailViewHolder(view)
    }

    override fun getItemCount(): Int = emails.size

    override fun onBindViewHolder(holder: EmailViewHolder, position: Int) {
        holder.bind(emails[position])
    }


    inner class EmailViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        fun bind(email: Email) {
            var txtUser = itemView.findViewById<TextView>(R.id.txt_user)
            var txtSubject = itemView.findViewById<TextView>(R.id.txt_subject)
            var txtIcon = itemView.findViewById<TextView>(R.id.txt_icon)
            with(email){
                val hash = user.hashCode()
                txtIcon.text = user.first().toString()
                txtIcon.background = itemView.oval(Color.rgb(hash, hash / 2, 0))
                txtUser.text = user
                txtSubject.text = subject
            }
        }

    }



}

fun View.oval(@ColorInt color: Int) : ShapeDrawable{
    val oval = ShapeDrawable(OvalShape())
    with(oval){
        intrinsicHeight = height
        intrinsicWidth = width
        paint.color = color
    }
    return oval
}