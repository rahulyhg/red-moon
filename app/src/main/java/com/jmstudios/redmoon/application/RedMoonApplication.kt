/*
 * Copyright (c) 2017  Stephen Michel <s@smichel.me>
 * SPDX-License-Identifier: GPL-3.0+
 */

package com.jmstudios.redmoon.application

import android.app.Application

class RedMoonApplication: Application() {

    override fun onCreate() {
        app = this
        super.onCreate()
        //EventBus.builder().addIndex(eventBusIndex()).installDefaultEventBus()
    }

    companion object {
        lateinit var app: RedMoonApplication
    }
}
