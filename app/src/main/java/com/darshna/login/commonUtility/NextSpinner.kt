package com.darshna.login.commonUtility

import android.content.Context
import android.util.AttributeSet
import android.view.View
import android.widget.LinearLayout
import com.darshna.login.R

class NextSpinner @JvmOverloads constructor(
  context: Context,
  attr: AttributeSet? = null
) : LinearLayout(context, attr) {

  init {
    init(context, attr)
  }

  private fun init(context: Context, attrs: AttributeSet?) {
    View.inflate(context, R.layout.layout_next_spinner, this)
  }

}
