package com.marion.codepathmail

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmailAdapter(private val emails: List<Email>): RecyclerView.Adapter<EmailAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val contactView = inflater.inflate(R.layout.email_item, parent, false)
        return ViewHolder(contactView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val email = emails.get(position)
        holder.senderTextView.text = email.sender
        holder.titleTextView.text = email.title
        holder.summaryTextView.text = email.summary

    }

    override fun getItemCount(): Int {
        return emails.size
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val titleTextView = itemView.findViewById<TextView>(R.id.tv_title)
        val senderTextView = itemView.findViewById<TextView>(R.id.tv_sender)
        val summaryTextView  = itemView.findViewById<TextView>(R.id.tv_summary)
    }

}