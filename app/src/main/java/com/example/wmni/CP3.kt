package com.example.wmni

import android.content.ContentProvider
import android.content.ContentValues
import android.database.Cursor
import android.net.Uri
import androidx.work.WorkManager

class CP3: ContentProvider() {
  override fun onCreate(): Boolean {
    WorkManager.getInstance(context!!)
    return true
  }

  override fun query(
    uri: Uri,
    projection: Array<out String>?,
    selection: String?,
    selectionArgs: Array<out String>?,
    sortOrder: String?
  ): Cursor? {
    TODO("Not yet implemented")
  }

  override fun getType(uri: Uri): String? {
    TODO("Not yet implemented")
  }

  override fun insert(uri: Uri, values: ContentValues?): Uri? {
    TODO("Not yet implemented")
  }

  override fun delete(uri: Uri, selection: String?, selectionArgs: Array<out String>?): Int {
    TODO("Not yet implemented")
  }

  override fun update(
    uri: Uri,
    values: ContentValues?,
    selection: String?,
    selectionArgs: Array<out String>?
  ): Int {
    TODO("Not yet implemented")
  }
}