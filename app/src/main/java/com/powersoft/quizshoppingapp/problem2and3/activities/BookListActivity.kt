package com.powersoft.quizshoppingapp.problem2and3.activities

import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.powersoft.quizshoppingapp.databinding.ActivityBookListBinding
import com.powersoft.quizshoppingapp.problem2and3.models.Book

class BookListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityBookListBinding
    private lateinit var books: ArrayList<Book>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBookListBinding.inflate(layoutInflater)
        setContentView(binding.root)

        books = ArrayList()
        initBooks()

        var adapter = ArrayAdapter<Book>(this, android.R.layout.simple_spinner_item, books)
        binding.lview.adapter = adapter
        binding.lview.setOnItemClickListener { parent, view, position, id ->
            val item = parent.getItemAtPosition(position) as Book
            Toast.makeText(this,"${item.name} \n authored by ${item.author}", Toast.LENGTH_LONG).show()
        }
    }

    fun initBooks() {
        books.add(Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling"))
        books.add(Book("And Then There Were None", "Agatha Christie"))
        books.add(Book("Alice's Adventures in Wonderland", "ewis Carroll"))
        books.add(Book("The Lion, the Witch, and the Wardrobe", "C.S. Lewis"))
        books.add(Book("Pinocchio", "Carlo Collodi"))
        books.add(Book("Catcher in the Rye", "J.D. Salinger"))
        books.add(Book("Anne of Green Gables", "L. M. Montgomery"))
        books.add(Book("Twenty Thousand Leagues Under the Sea", "Jules Verne"))
        books.add(Book("Don Quixote", "Miguel de Cervantes"))
        books.add(Book("Lord of the Rings", "J.R.R. Tolkien"))
    }
}