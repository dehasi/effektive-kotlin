package item1.mutability

interface Element {
    var active: Boolean
}

class ActualElement : Element {
    override var active: Boolean = false
}
