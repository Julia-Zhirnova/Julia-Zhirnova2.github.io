import java.util.*
 
fun main(args: Array<String>) {
    var carSpeed = 87
    var townSpeed = 60

	var fineFor20to40 = 500
	var fineFor40to60 = 1000
	var fineFor60to80 = 2000
	var fineFor80andMore = 5000
	
	var overSpeed = carSpeed - townSpeed
	
	if (overSpeed < 20) {
	    print("Скорость не превышена или превышена незначительно")
	} else if (overSpeed >= 20 && overSpeed < 40) {
	    print("Штраф: " + fineFor20to40)
	} else if (overSpeed >= 40 && overSpeed < 60) {
	    print("Штраф: " + fineFor40to60)
	} else if (overSpeed >= 60 && overSpeed < 80) {
	    print("Штраф: " + fineFor60to80)
	} else {
	    print("Штраф: " + fineFor80andMore)
	}
}