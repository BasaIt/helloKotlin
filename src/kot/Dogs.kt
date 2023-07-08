package kot

class Dogs {
    var name = ""
        get() = field.uppercase()

    var weight = 0
        set(value) {
            if (value >= 0)
                field = value
        }
    var age = 0
        set(value) {
            if (value >= 0)
                field = value
        }
}
