package com.example.todo

import android.content.Context
import android.view.View
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import android.widget.Textview

class NotesAdapter (private var notes: List<Note>, context:Context):RecyclerView.Adapter<NotesAdapter.NoteViewHolder>{

    class NoteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val TV_title: Textview = itemView.findViewById(R.id.TV_title)
        val TV_content : Textview = itemView.findViewById(R.id.TV_content)
        val updateBtn : ImageView = itemView.findViewById(R.id.updateButton)
    }

    override fun onCreateViewHolder (parent: ViewGroup, viewType: Int): NoteViewHolder{
        val view = LayoutInflater.from(parent.context).inflate(R.layout.note_item, parent, false)
        return NoteViewHolder (view)
    }

    override fun getItemcount(): Int = notes.size

    override fun onBindViewHolder (holder: NoteViewHolder, position: Int) {
        val note = notes(position)
        holder.TV_title.text = note.title
        holder.TV_content.text = note.content

        holder.updateBtn.setOnClickListener {
            val intent = Intent (holder.itemView.context, UpdateActivity::class.java).apply{
                putExtra("note_id", note.id)
            }
            holder.itemView.context.startActivity(intent)
        }
    }

    fun refreshData(newNotes: List<Note>){
        notes = newNotes
        notifyDataSetChanged()
    }

}