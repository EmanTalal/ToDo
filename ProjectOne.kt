package com.example.projectone

fun main() {
    var toDo = ToDo()
    var task1 = Task(2, "Abdulrahman", "Travel to NewYork ")
    var task2 = Task(3, "Eman", "Buy a car  ")
    var task3 = Task(4, "Abdulrahman", "Sell my Cat ")

    toDo.addTask(task1)
    toDo.addTask(task2)
    toDo.addTask(task3)
    toDo.PrintSpecificTask(2)
    toDo.reomeTask(task1)
    toDo.changeTask(task3)
    toDo.showTask()


}


 data class Task(var id:Int,var name:String, var note:String , var isCompleted:Boolean=false)

  class ToDo{

    val tasks= arrayListOf<Task>()

      fun showTask(){
          println("All Tasks:")
          for (task in tasks) {
              println("Task: ${task.note}")
          }
      }

     fun addTask(task: Task){
         println("Add Task: "+ task.note)
         tasks.add(task)
     }
    fun reomeTask(task:Task){
        println("Remove Task:"+ task.note)
        tasks.remove(task)
    }
      fun PrintSpecificTask(id : Int){
          print("Task Details:")
          for (index in tasks) {
              if (id == index.id)
                  println(" ID (${index.id}), name (${index.name}), Task (${index.note}), Completed (${index.isCompleted}) ")
          }
      }
      fun changeTask (isComplete: Task ){
          println("Task: ${isComplete.note}, Complete: ${!isComplete.isCompleted}")
      }

  }



