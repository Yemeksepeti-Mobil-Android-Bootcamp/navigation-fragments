package com.kodluyoruz.navigation.fragments.list

import com.kodluyoruz.navigation.models.Pet

interface IPetOnClickListener {
    fun onClick(name: Pet)
}