package org.shatteredring.model

//import io.realm.RealmList
//import io.realm.RealmObject
//import io.realm.annotations.PrimaryKey
//import io.realm.realmListOf
import java.util.*

class Game/*: RealmObject*/ {
    //@PrimaryKey
    var _id: UUID = UUID.randomUUID()
    var name: String = ""
    var isActive: Boolean = false
    var npcs: ArrayList<NPC> = ArrayList()//RealmList<NPC> = realmListOf()
    var locations: ArrayList<Location> = ArrayList()//RealmList<Location> = realmListOf()
    var quests: ArrayList<Quest> = ArrayList()//RealmList<Quest> = realmListOf()
}