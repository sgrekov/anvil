package com.test.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.content.res.ResourcesCompat
import android.util.Log
import android.widget.Button
import trikita.anvil.BaseDSL.WRAP
import android.widget.LinearLayout
import trikita.anvil.Anvil
import trikita.anvil.BaseDSL
import trikita.anvil.BaseDSL.MATCH
import trikita.anvil.BaseDSL.dip
import trikita.anvil.BaseDSL.init
import trikita.anvil.BaseDSL.padding
import trikita.anvil.BaseDSL.size
import trikita.anvil.DSL
import trikita.anvil.DSL.button
import trikita.anvil.DSL.linearLayout
import trikita.anvil.DSL.onClick
import trikita.anvil.DSL.orientation
import trikita.anvil.DSL.text
import trikita.anvil.DSL.textView
import trikita.anvil.RenderableView


class MainActivity : AppCompatActivity() {

    var ticktock = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(object : RenderableView(this) {
            override fun view() {
                Log.d("tag", "my RenderableView view ")
                linearLayout {
                    size(MATCH, MATCH)
                    padding(dip(8))
                    orientation(LinearLayout.VERTICAL)

                    textView {
                        size(MATCH, WRAP)
                        text("Tick-tock: $ticktock")
                    }

                    button {
                        size(WRAP, WRAP)
                        text("Tick")
                        onClick { v ->
                            ticktock++
                        }
                    }
                }
            }
        })
    }
}
