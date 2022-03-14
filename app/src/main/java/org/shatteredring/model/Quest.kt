package org.shatteredring.model

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*

class Quest: RealmObject {
    @PrimaryKey
    var _id: Long = Random().nextLong()
    var name: String = ""
    var isComplete: Boolean = false
    var notes: String = ""
    // inverse relationship to NPCs giving quests
    // inverse relationship to game
}