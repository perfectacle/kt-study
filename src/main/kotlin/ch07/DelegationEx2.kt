package ch07

import java.beans.PropertyChangeListener
import java.beans.PropertyChangeSupport

open class PropertyChangeAware {
    protected val changeSupport = PropertyChangeSupport(this)
    fun addPropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.addPropertyChangeListener(listener)
    }

    fun removePropertyChangeListener(listener: PropertyChangeListener) {
        changeSupport.removePropertyChangeListener(listener)
    }
}

class People(val name: String, age: Int, salary: Int) : PropertyChangeAware() {
    var age: Int = age
        set(value) {
            val oldValue = field
            field = value
            changeSupport.firePropertyChange("age", oldValue, value)
        }

    var salary: Int = salary
        set(value) {
            val oldValue = field
            field = value
            changeSupport.firePropertyChange("salary", oldValue, value)
        }
}

fun main() {
    val people = People("Dmitry", 34, 20000)
    people.addPropertyChangeListener(
        PropertyChangeListener {
            println("Property ${it.propertyName} changed from ${it.oldValue} to ${it.newValue}")
        }
    )

    people.age = 35
    people.salary = 25000
}