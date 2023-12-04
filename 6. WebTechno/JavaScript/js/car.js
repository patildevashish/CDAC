function Car(brand,type,name) 
{
    this.brand = brand
    this.name = name
    this.type = type

    this.setBrand = function(brand)
    {
        this.brand = brand
    }

    this.setName = function(name)
    {
        this.name = name
    }

    this.setType = function(type)
    {
        this.type = type
    }

    this.getBrand = function()
    {
        return this.brand
    }

    this.getName = function()
    {
        return this.name
    }

    this.getType = function()
    {
        return this.type
    }
}

c1 = new Car("Audi","Speedster","Audi 240")
c2 = new Car("Jaguar","SUV","Monster")

console.log(c1)
console.log(c2)