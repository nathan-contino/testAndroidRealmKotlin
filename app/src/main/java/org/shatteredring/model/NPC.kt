package org.shatteredring.model

import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.realmListOf
import java.util.*

class NPC: RealmObject {
    @PrimaryKey
    val _id = UUID.randomUUID()
    var name: String = ""
    var isMerchant: Boolean = false
    var locations: RealmList<Location> = realmListOf()
    var quests: RealmList<Quest> = realmListOf()
    var notes: String = ""
    //inverse relationship to game
}