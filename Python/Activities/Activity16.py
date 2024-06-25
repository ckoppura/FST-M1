class Car:
    'This is Car Class'

    def __init__(self, manufacturer,make,model,transmission,color):
     self.manufacturer = manufacturer
     self.make=make
     self.model=model
     self.transmission=transmission
     self.color=color


    def accelerate(self):
        print(self.manufacturer + " " + self.model + " has started moving")
 
    def stop(self):
        print(self.manufacturer + " " + self.model + " has stopped moving")
car1= Car("Tata","EV","2024","Manual","Red")
	
car2 = Car("Maruti", "800", "2013", "Manual", "Red")

car1.accelerate()
car1.stop()

car2.accelerate()
car2.stop()