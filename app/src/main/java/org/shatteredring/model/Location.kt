package org.shatteredring.model

import io.realm.RealmObject
import io.realm.annotations.PrimaryKey
import java.util.*

class Location : RealmObject {
    @PrimaryKey
    var _id: Long = Random().nextLong()
    var name: String = ""
    var isCleared: Boolean = false
    var hasSmithAnvil: Boolean = false
    var hasMerchant: Boolean = false
    var notes: String = ""
    // inverse relationship to NPCs
    // inverse relationship to game
}