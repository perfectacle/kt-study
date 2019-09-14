package ch07

import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport
import kotlin.reflect.KProperty

class ObservableProperty2(
    var propValue: Int,
    val changeSupport: PropertyChangeSupport
) {
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): Int = propValue
    operator fun setValue(thisRef: Any?, prop: KProperty<*>, newValue: Int) {
        val oldValue = propValue
        propValue = newValue
        changeSupport.firePropertyChange(prop.name, oldValue, newValue)
    }
}

class People3(val name: String, age: Int, salary: Int) : PropertyChangeAware() {
    var age: Int by ObservableProperty2(age, changeSupport)
    var salary: Int by ObservableProperty2(salary, changeSupport)

}

fun main() {
    val people = People3("Dmitry", 34, 20000)
    people.addPropertyChangeListener(
        PropertyChangeListener {
            println("Property ${it.propertyName} changed from ${it.oldValue} to ${it.newValue}")
        }
    )

    people.age = 35
    people.salary = 25000
}