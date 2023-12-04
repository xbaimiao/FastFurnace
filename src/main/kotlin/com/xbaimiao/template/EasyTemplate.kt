package com.xbaimiao.template

import com.xbaimiao.easylib.EasyPlugin
import com.xbaimiao.easylib.util.info

@Suppress("unused")
class EasyTemplate : EasyPlugin() {

    override fun enable() {
        for (slot in 0..10000) {
            info(slot)
        }
    }

}