package org.shatteredring.model

import io.realm.RealmList
import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import io.realm.realmListOf
import java.util.*

class Game: RealmObject {
    @PrimaryKey
    var _id: Long = Random().nextLong()
    var name: String = ""
    var isActive: Boolean = false
    var npcs: RealmList<NPC> = realmListOf()
    var locations: RealmList<Location> = realmListOf()
    var quests: RealmList<Quest> = realmListOf()
}