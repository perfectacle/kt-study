package ch04

import ch01.Person

object Payroll {
    val employees = arrayListOf<Person>()
    fun calculateSalary() {
        for (employee in employees) {

        }
    }
}

fun main() {
    Payroll.employees.add(Person("asdf"))
}