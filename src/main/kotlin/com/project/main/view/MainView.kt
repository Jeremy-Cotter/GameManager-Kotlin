package com.project.main.view

import javafx.beans.property.SimpleIntegerProperty
import javafx.beans.property.SimpleStringProperty
import javafx.scene.text.Font
import java.util.*
import tornadofx.*

class MainView : View("Game Manager") {
    var a = 0
    var list1 = arrayOfNulls<SimpleStringProperty>(1)
    var list2 = arrayOfNulls<SimpleStringProperty>(2)
    var list3 = arrayOfNulls<SimpleStringProperty>(3)
    var list4 = arrayOfNulls<SimpleStringProperty>(4)
    var list5 = arrayOfNulls<SimpleStringProperty>(5)
    var list6 = arrayOfNulls<SimpleStringProperty>(6)
    var list7 = arrayOfNulls<SimpleStringProperty>(7)
    var list8 = arrayOfNulls<SimpleStringProperty>(8)
    var list9 = arrayOfNulls<SimpleStringProperty>(9)
    var list10 = arrayOfNulls<SimpleStringProperty>(10)
    var names0 = SimpleStringProperty()
    var names1 = SimpleStringProperty()
    var names2 = SimpleStringProperty()
    var names3 = SimpleStringProperty()
    var names4 = SimpleStringProperty()
    var names5 = SimpleStringProperty()
    var names6 = SimpleStringProperty()
    var names7 = SimpleStringProperty()
    var names8 = SimpleStringProperty()
    var names9 = SimpleStringProperty()
    private var life = arrayOf(SimpleIntegerProperty(20), SimpleIntegerProperty(20), SimpleIntegerProperty(20), SimpleIntegerProperty(20), SimpleIntegerProperty(20), SimpleIntegerProperty(20), SimpleIntegerProperty(20), SimpleIntegerProperty(20), SimpleIntegerProperty(20), SimpleIntegerProperty(20))
    private val dinput = SimpleStringProperty()
    private val linput = SimpleStringProperty("Name Here")
    override val root = squeezebox {
        setMinSize(800.0, 800.0)
        fold(expanded = true, closeable = false) {
            drawer {
                item("About", expanded = true) {
                    label("Welcome to Game Manager"){
                        font = Font(30.0)
                    }
                    text("This application will help when playing tabletop games. We provide three features that are listed below:") {

                    }
                    text("1. Turn Order: This feature lets you select up to 10 plays, type in their names and choose whether to shuffle the players or not"){
                        wrappingWidth = 400.0
                    }
                    text("2. Dice Roller: This feature lets you roll different dice, there is a list of default dice and a custom die field"){
                        wrappingWidth = 400.0
                    }
                    text("3. Life Counter: This feature lets you keep track of up to 9 different player's health. You can also label each one with whatever name you would like"){
                        wrappingWidth = 400.0
                    }
                }
                item("Turn Order") {
                    var please =""
                    borderpane {
                        top = label("Click the Number of Players") {}
                        bottom = togglebutton("Order") {
                            action {
                                text = if (isSelected) "Order" else "Shuffle"
                                if(text=="Order") {
                                    please = ""
                                }
                                else {
                                    please ="fun"
                                }

                            }
                        }
                        left = flowpane {
                            for (i in 1..10) {

                                button(i.toString()) {
                                    setOnAction {
                                        a = i; println(i);
                                        hbox {
                                            center = vbox {
                                                when (i) {
                                                    1 ->
                                                        textfield(names0) {
                                                            list1[0]=names0
                                                            useMaxWidth = true

                                                        }


                                                    2 -> {
                                                        textfield(names0) {
                                                            list2[0]=names0
                                                            useMaxWidth = true

                                                        }
                                                        textfield(names1) {
                                                            list2[1]=names1
                                                            useMaxWidth = true
                                                        }
                                                    }
                                                    3 -> {
                                                        textfield(names0) {
                                                            list3[0]=names0
                                                            useMaxWidth = true

                                                        }
                                                        textfield(names1) {
                                                            list3[1]=names1
                                                            useMaxWidth = true
                                                        }
                                                        textfield(names2) {
                                                            list3[2]=names2
                                                            useMaxWidth = true
                                                        }
                                                    }
                                                    4 -> {
                                                        textfield(names0) {
                                                            list4[0]=names0
                                                            useMaxWidth = true

                                                        }
                                                        textfield(names1) {
                                                            list4[1]=names1
                                                            useMaxWidth = true
                                                        }
                                                        textfield(names2) {
                                                            list4[2]=names2
                                                            useMaxWidth = true
                                                        }
                                                        textfield(names3) {
                                                            list4[3]=names3
                                                            useMaxWidth = true
                                                        }
                                                    }
                                                    5 -> {
                                                        textfield(names0) {
                                                            list5[0]=names0
                                                            useMaxWidth = true

                                                        }
                                                        textfield(names1) {
                                                            list5[1]=names1
                                                            useMaxWidth = true
                                                        }
                                                        textfield(names2) {
                                                            list5[2]=names2
                                                            useMaxWidth = true
                                                        }
                                                        textfield(names3) {
                                                            list5[3]=names3
                                                            useMaxWidth = true
                                                        }
                                                        textfield(names4) {
                                                            list5[4]=names4
                                                            useMaxWidth = true
                                                        }

                                                    }
                                                    6 -> {
                                                        textfield(names0) {
                                                            list6[0]=names0
                                                            useMaxWidth = true

                                                        }
                                                        textfield(names1) {
                                                            list6[1]=names1
                                                            useMaxWidth = true
                                                        }
                                                        textfield(names2) {
                                                            list6[2]=names2
                                                            useMaxWidth = true
                                                        }
                                                        textfield(names3) {
                                                            list6[3]=names3
                                                            useMaxWidth = true
                                                        }
                                                        textfield(names4) {
                                                            list6[4]=names4
                                                            useMaxWidth = true
                                                        }
                                                        textfield(names5) {
                                                            list6[5]=names5
                                                            useMaxWidth = true
                                                        }
                                                    }
                                                    7 -> {
                                                        textfield(names0) {
                                                            list7[0]=names0
                                                            useMaxWidth = true

                                                        }
                                                        textfield(names1) {
                                                            list7[1]=names1
                                                            useMaxWidth = true
                                                        }
                                                        textfield(names2) {
                                                            list7[2]=names2
                                                            useMaxWidth = true
                                                        }
                                                        textfield(names3) {
                                                            list7[3]=names3
                                                            useMaxWidth = true
                                                        }
                                                        textfield(names4) {
                                                            list7[4]=names4
                                                            useMaxWidth = true
                                                        }
                                                        textfield(names5) {
                                                            list7[5]=names5
                                                            useMaxWidth = true
                                                        }

                                                        textfield(names6) {
                                                            list7[6]=names6
                                                            useMaxWidth = true
                                                        }
                                                    }
                                                    8 -> {
                                                        textfield(names0) {
                                                            list8[0]=names0
                                                            useMaxWidth = true

                                                        }
                                                        textfield(names1) {
                                                            list8[1]=names1
                                                            useMaxWidth = true
                                                        }
                                                        textfield(names2) {
                                                            list8[2]=names2
                                                            useMaxWidth = true
                                                        }
                                                        textfield(names3) {
                                                            list8[3]=names3
                                                            useMaxWidth = true
                                                        }
                                                        textfield(names4) {
                                                            list8[4]=names4
                                                            useMaxWidth = true
                                                        }
                                                        textfield(names5) {
                                                            list8[5]=names5
                                                            useMaxWidth = true
                                                        }

                                                        textfield(names6) {
                                                            list8[6]=names6
                                                            useMaxWidth = true
                                                        }
                                                        textfield(names7) {
                                                            list8[7]=names7
                                                            useMaxWidth = true
                                                        }
                                                    }
                                                    9 -> {
                                                        textfield(names0) {
                                                            list9[0]=names0
                                                            useMaxWidth = true

                                                        }
                                                        textfield(names1) {
                                                            list9[1]=names1
                                                            useMaxWidth = true
                                                        }
                                                        textfield(names2) {
                                                            list9[2]=names2
                                                            useMaxWidth = true
                                                        }
                                                        textfield(names3) {
                                                            list9[3]=names3
                                                            useMaxWidth = true
                                                        }
                                                        textfield(names4) {
                                                            list9[4]=names4
                                                            useMaxWidth = true
                                                        }
                                                        textfield(names5) {
                                                            list9[5]=names5
                                                            useMaxWidth = true
                                                        }

                                                        textfield(names6) {
                                                            list9[6]=names6
                                                            useMaxWidth = true
                                                        }
                                                        textfield(names7) {
                                                            list9[7]=names7
                                                            useMaxWidth = true
                                                        }
                                                        textfield(names8) {
                                                            list9[8]=names8
                                                            useMaxWidth = true
                                                        }
                                                    }
                                                    10 -> {
                                                        textfield(names0) {
                                                            list10[0]=names0
                                                            useMaxWidth = true

                                                        }
                                                        textfield(names1) {
                                                            list10[1]=names1
                                                            useMaxWidth = true
                                                        }
                                                        textfield(names2) {
                                                            list10[2]=names2
                                                            useMaxWidth = true
                                                        }
                                                        textfield(names3) {
                                                            list10[3]=names3
                                                            useMaxWidth = true
                                                        }
                                                        textfield(names4) {
                                                            list10[4]=names4
                                                            useMaxWidth = true
                                                        }
                                                        textfield(names5) {
                                                            list10[5]=names5
                                                            useMaxWidth = true
                                                        }

                                                        textfield(names6) {
                                                            list10[6]=names6
                                                            useMaxWidth = true
                                                        }
                                                        textfield(names7) {
                                                            list10[7]=names7
                                                            useMaxWidth = true
                                                        }
                                                        textfield(names8) {
                                                            list10[8]=names8
                                                            useMaxWidth = true
                                                        }
                                                        textfield(names9) {
                                                            list10[9]=names9
                                                            useMaxWidth = true
                                                        }
                                                    }

                                                }
                                            }
                                            right = button("Submit") {
                                                action {
                                                    if (please == "fun"){
                                                        when (i) {
                                                            1 ->
                                                                right = listview<String> {
                                                                    list1.shuffle()
                                                                    useMaxSize
                                                                    items.add(list1[0]?.value)
                                                                }
                                                            2 ->
                                                                right = listview<String> {
                                                                    list2.shuffle()
                                                                    useMaxSize
                                                                    items.add(list2[0]?.value)
                                                                    items.add(list2[1]?.value)
                                                                }
                                                            3 ->
                                                                right = listview<String> {
                                                                    list3.shuffle()
                                                                    useMaxSize
                                                                    items.add(list3[0]?.value)
                                                                    items.add(list3[1]?.value)
                                                                    items.add(list3[2]?.value)
                                                                }
                                                            4 ->
                                                                right = listview<String> {
                                                                    list4.shuffle()
                                                                    useMaxSize
                                                                    items.add(list4[0]?.value)
                                                                    items.add(list4[1]?.value)
                                                                    items.add(list4[2]?.value)
                                                                    items.add(list4[3]?.value)
                                                                }
                                                            5 ->
                                                                right = listview<String> {
                                                                    list5.shuffle()
                                                                    useMaxSize
                                                                    items.add(list5[0]?.value)
                                                                    items.add(list5[1]?.value)
                                                                    items.add(list5[2]?.value)
                                                                    items.add(list5[3]?.value)
                                                                    items.add(list5[4]?.value)
                                                                }
                                                            6 ->
                                                                right = listview<String> {
                                                                    list6.shuffle()
                                                                    useMaxSize
                                                                    items.add(list6[0]?.value)
                                                                    items.add(list6[1]?.value)
                                                                    items.add(list6[2]?.value)
                                                                    items.add(list6[3]?.value)
                                                                    items.add(list6[4]?.value)
                                                                    items.add(list6[5]?.value)
                                                                }
                                                            7 ->
                                                                right = listview<String> {
                                                                    list7.shuffle()
                                                                    useMaxSize
                                                                    items.add(list7[0]?.value)
                                                                    items.add(list7[1]?.value)
                                                                    items.add(list7[2]?.value)
                                                                    items.add(list7[3]?.value)
                                                                    items.add(list7[4]?.value)
                                                                    items.add(list7[5]?.value)
                                                                    items.add(list7[6]?.value)
                                                                }
                                                            8 ->
                                                                right = listview<String> {
                                                                    list8.shuffle()
                                                                    useMaxSize
                                                                    items.add(list8[0]?.value)
                                                                    items.add(list8[1]?.value)
                                                                    items.add(list8[2]?.value)
                                                                    items.add(list8[3]?.value)
                                                                    items.add(list8[4]?.value)
                                                                    items.add(list8[5]?.value)
                                                                    items.add(list8[6]?.value)
                                                                    items.add(list8[7]?.value)
                                                                }
                                                            9 ->
                                                                right = listview<String> {
                                                                    list9.shuffle()
                                                                    useMaxSize
                                                                    items.add(list9[0]?.value)
                                                                    items.add(list9[1]?.value)
                                                                    items.add(list9[2]?.value)
                                                                    items.add(list9[3]?.value)
                                                                    items.add(list9[4]?.value)
                                                                    items.add(list9[5]?.value)
                                                                    items.add(list9[6]?.value)
                                                                    items.add(list9[7]?.value)
                                                                    items.add(list9[8]?.value)

                                                                }
                                                            10 ->
                                                                right = listview<String> {
                                                                    list10.shuffle()
                                                                    useMaxSize
                                                                    items.add(list10[0]?.value)
                                                                    items.add(list10[1]?.value)
                                                                    items.add(list10[2]?.value)
                                                                    items.add(list10[3]?.value)
                                                                    items.add(list10[4]?.value)
                                                                    items.add(list10[5]?.value)
                                                                    items.add(list10[6]?.value)
                                                                    items.add(list10[7]?.value)
                                                                    items.add(list10[8]?.value)
                                                                    items.add(list10[9]?.value)
                                                                }


                                                        }
                                                    }
                                                    else if (please =="")
                                                        when (i) {
                                                            1 ->
                                                                right = listview<String> {
                                                                    useMaxSize
                                                                    items.add(list1[0]?.value)
                                                                }
                                                            2 ->
                                                                right = listview<String> {
                                                                    useMaxSize
                                                                    items.add(list2[0]?.value)
                                                                    items.add(list2[1]?.value)
                                                                }
                                                            3 ->
                                                                right = listview<String> {
                                                                    useMaxSize
                                                                    items.add(list3[0]?.value)
                                                                    items.add(list3[1]?.value)
                                                                    items.add(list3[2]?.value)
                                                                }
                                                            4 ->
                                                                right = listview<String> {
                                                                    useMaxSize
                                                                    items.add(list4[0]?.value)
                                                                    items.add(list4[1]?.value)
                                                                    items.add(list4[2]?.value)
                                                                    items.add(list4[3]?.value)
                                                                }
                                                            5 ->
                                                                right = listview<String> {
                                                                    useMaxSize
                                                                    items.add(list5[0]?.value)
                                                                    items.add(list5[1]?.value)
                                                                    items.add(list5[2]?.value)
                                                                    items.add(list5[3]?.value)
                                                                    items.add(list5[4]?.value)
                                                                }
                                                            6 ->
                                                                right = listview<String> {
                                                                    useMaxSize
                                                                    items.add(list6[0]?.value)
                                                                    items.add(list6[1]?.value)
                                                                    items.add(list6[2]?.value)
                                                                    items.add(list6[3]?.value)
                                                                    items.add(list6[4]?.value)
                                                                    items.add(list6[5]?.value)
                                                                }
                                                            7 ->
                                                                right = listview<String> {
                                                                    useMaxSize
                                                                    items.add(list7[0]?.value)
                                                                    items.add(list7[1]?.value)
                                                                    items.add(list7[2]?.value)
                                                                    items.add(list7[3]?.value)
                                                                    items.add(list7[4]?.value)
                                                                    items.add(list7[5]?.value)
                                                                    items.add(list7[6]?.value)
                                                                }
                                                            8 ->
                                                                right = listview<String> {
                                                                    useMaxSize
                                                                    items.add(list8[0]?.value)
                                                                    items.add(list8[1]?.value)
                                                                    items.add(list8[2]?.value)
                                                                    items.add(list8[3]?.value)
                                                                    items.add(list8[4]?.value)
                                                                    items.add(list8[5]?.value)
                                                                    items.add(list8[6]?.value)
                                                                    items.add(list8[7]?.value)
                                                                }
                                                            9 ->
                                                                right = listview<String> {
                                                                    useMaxSize
                                                                    items.add(list9[0]?.value)
                                                                    items.add(list9[1]?.value)
                                                                    items.add(list9[2]?.value)
                                                                    items.add(list9[3]?.value)
                                                                    items.add(list9[4]?.value)
                                                                    items.add(list9[5]?.value)
                                                                    items.add(list9[6]?.value)
                                                                    items.add(list9[7]?.value)
                                                                    items.add(list9[8]?.value)

                                                                }
                                                            10 ->
                                                                right = listview<String> {
                                                                    useMaxSize
                                                                    items.add(list10[0]?.value)
                                                                    items.add(list10[1]?.value)
                                                                    items.add(list10[2]?.value)
                                                                    items.add(list10[3]?.value)
                                                                    items.add(list10[4]?.value)
                                                                    items.add(list10[5]?.value)
                                                                    items.add(list10[6]?.value)
                                                                    items.add(list10[7]?.value)
                                                                    items.add(list10[8]?.value)
                                                                    items.add(list10[9]?.value)
                                                                }


                                                        }
                                                }


                                            }
                                        }
                                    }

                                }
                            }
                        }
                    }
                }
                item("Dice Roller") {
                    val input = SimpleIntegerProperty()
                    var result = SimpleIntegerProperty()

                    val root = form {
                        label(title)
                        fieldset {
                            vbox {
                                hbox {
                                    button("D4") {
                                        action { result.value = Random().nextInt(4) + 1 }
                                    }
                                    button("D6") {
                                        action { result.value = Random().nextInt(6) + 1 }
                                    }
                                    button("D8") {
                                        action { result.value = Random().nextInt(8) + 1 }
                                    }
                                }
                                hbox {
                                    button("D10") {
                                        action { result.value = Random().nextInt(10) + 1 }
                                    }
                                    button("D12") {
                                        action { result.value = Random().nextInt(12) + 1 }
                                    }
                                    button("D20") {
                                        action { result.value = Random().nextInt(20) + 1 }
                                    }
                                }
                                hbox {
                                    field("Custom Die") {
                                        textfield(input)
                                    }
                                    button("Roll") {
                                        action { result.value = Random().nextInt(input.value) + 1 }
                                    }
                                }
                                hbox {
                                    label {
                                        text = "Result: "
                                    }
                                    label().bind(result)
                                }
                            }
                        }
                    }
                }
                item("Life Counter") {

                    form {
                        fieldset {
                            vbox {
                                hbox {
                                    vbox {
                                        field { textfield { } }
                                        hbox {
                                            button("-5") {
                                                action {
                                                    life[0].value -= 5
                                                }
                                            }
                                            button("-") {
                                                action {
                                                    life[0].value--
                                                }
                                            }
                                            label().bind(life[0])
                                            button("+") {
                                                action {
                                                    life[0].value++
                                                }
                                            }
                                            button("+5") {
                                                action {
                                                    life[0].value += 5
                                                }
                                            }
                                        }
                                    }
                                    vbox {
                                        field { textfield { } }
                                        hbox {
                                            button("-5") {
                                                action {
                                                    life[1].value -= 5
                                                }
                                            }
                                            button("-") {
                                                action {
                                                    life[1].value--
                                                }
                                            }
                                            label().bind(life[1])
                                            button("+") {
                                                action {
                                                    life[1].value++
                                                }
                                            }
                                            button("+5") {
                                                action {
                                                    life[1].value += 5
                                                }
                                            }
                                        }
                                    }
                                    vbox {
                                        field { textfield {} }
                                        hbox {
                                            button("-5") {
                                                action {
                                                    life[2].value -= 5
                                                }
                                            }
                                            button("-") {
                                                action {
                                                    life[2].value--
                                                }
                                            }
                                            label().bind(life[2])
                                            button("+") {
                                                action {
                                                    life[2].value++
                                                }
                                            }
                                            button("+5") {
                                                action {
                                                    life[2].value += 5
                                                }
                                            }

                                        }
                                    }
                                }
                                hbox {
                                    vbox {
                                        field { textfield { } }
                                        hbox {
                                            button("-5") {
                                                action {
                                                    life[3].value -= 5
                                                }
                                            }
                                            button("-") {
                                                action {
                                                    life[3].value--
                                                }
                                            }
                                            label().bind(life[3])
                                            button("+") {
                                                action {
                                                    life[3].value++
                                                }
                                            }
                                            button("+5") {
                                                action {
                                                    life[3].value += 5
                                                }
                                            }
                                        }
                                    }
                                    vbox {
                                        field { textfield { } }
                                        hbox {
                                            button("-5") {
                                                action {
                                                    life[4].value -= 5
                                                }
                                            }
                                            button("-") {
                                                action {
                                                    life[4].value--
                                                }
                                            }
                                            label().bind(life[4])
                                            button("+") {
                                                action {
                                                    life[4].value++
                                                }
                                            }
                                            button("+5") {
                                                action {
                                                    life[4].value += 5
                                                }
                                            }
                                        }
                                    }
                                    vbox {
                                        field { textfield { } }
                                        hbox {
                                            button("-5") {
                                                action {
                                                    life[5].value -= 5
                                                }
                                            }
                                            button("-") {
                                                action {
                                                    life[5].value--
                                                }
                                            }
                                            label().bind(life[5])
                                            button("+") {
                                                action {
                                                    life[5].value++
                                                }
                                            }
                                            button("+5") {
                                                action {
                                                    life[5].value += 5
                                                }
                                            }
                                        }
                                    }
                                }
                                hbox {
                                    vbox {
                                        field { textfield {} }
                                        hbox {
                                            button("-5") {
                                                action {
                                                    life[6].value -= 5
                                                }
                                            }
                                            button("-") {
                                                action {
                                                    life[6].value--
                                                }
                                            }
                                            label().bind(life[6])
                                            button("+") {
                                                action {
                                                    life[6].value++
                                                }
                                            }
                                            button("+5") {
                                                action {
                                                    life[6].value += 5
                                                }
                                            }
                                        }
                                    }
                                    vbox {
                                        field { textfield { } }
                                        hbox {
                                            button("-5") {
                                                action {
                                                    life[7].value -= 5
                                                }
                                            }
                                            button("-") {
                                                action {
                                                    life[7].value--
                                                }
                                            }
                                            label().bind(life[7])
                                            button("+") {
                                                action {
                                                    life[7].value++
                                                }
                                            }
                                            button("+5") {
                                                action {
                                                    life[7].value += 5
                                                }
                                            }
                                        }
                                    }
                                    vbox {
                                        field { textfield { } }
                                        hbox {
                                            button("-5") {
                                                action {
                                                    life[8].value -= 5
                                                }
                                            }
                                            button("-") {
                                                action {
                                                    life[8].value--
                                                }
                                            }
                                            label().bind(life[8])
                                            button("+") {
                                                action {
                                                    life[8].value++
                                                }
                                            }
                                            button("+5") {
                                                action {
                                                    life[8].value += 5
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        fold("Notes", expanded = false, closeable = false) {
            form {
                textarea {  }
            }
        }
    }
    fun <T> Array<T>.shuffle(): Array<T> {
        val rng = Random()
        for (index in 1..this.size-1) {
            val randomIndex = rng.nextInt(index)
            val temp = this[index]
            this[index] = this[randomIndex]
            this[randomIndex] = temp
        }

        return this
    }
}
