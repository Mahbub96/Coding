import numpy as np
from keyring.backends import null

equations = []
addRes = null
values = []

#input equation function defination 
def InputEqua() :
    maxRoot = int(input("Enter Maximum root value :"))

    arr = []
    
    while maxRoot+1 :
        arr.append(int(input(" Enter denominator of x^"+str(maxRoot)+" : ")))
        maxRoot -= 1

    e = np.poly1d(arr)
    return e

####To show the All the Equation 
def Show():
    length = len(equations)
    flag = 0
    while length :
        print(equations[flag])
        flag += 1
        length -= 1

#### add two equations
def Add():
    addRes = np.polyadd(equations[0],equations[1])
    print("Add first two equations result : ")
    print(addRes)


#### Calcualte on Realte a value of X
def Calc() :
    print("Which one : ")
    Show()
    
    ch = int(input("\n\n\t1.For first Equation \n\t2.For Second Equation\n\n\tEnter Your choice : "))

    val = int(input("Enter a value of X : "))
    print(equations[ch - 1](val))

def avgEquation() :
    print("none")



#### print value of iteration
def printValues(i,first,last,avg,value) :
    print(str(i+1) + " ,first : "+str(first)+" ,last : "+str(last)+" ,avg : "+str(avg)+" ,value : "+str(value)+"\n")


###make iteration on this funciton 
###basically this is the main target Function
def iteration(first,last,equationNumber1,equationNumber2,now,end) :    
    
    
    avg = (first + last)/2
    value = float(equations[equationNumber1](avg)) 
    values.append(value)
    printValues(now,first,last,avg,value)


    if value < 0 : first = avg
    else : last = avg
    
    if now == end : return

    
    iteration(first,last,equationNumber1,equationNumber1,now+1,end)
    







#####single Equaitons iterations deffination 
def singleIteration() :
    

    print("Which one : ")
    Show()
    
    ch = int(input("\n\n\t1.For first Equation \n\t2.For Second Equation\n\n\tEnter Your choice : "))
    ch -= 1
    equations[ch]
    first = float(input("Enter first value for variable :"))
    last = float(input("Enter another value for variable : "))
    
    i = int(input("How many iteration you want : "))

    iteration(first,last,ch,ch,0,i)





def checkIteration() :
    decession = int(input("How Many Equation to be needed : \n\t1.for single Equation\n\t2.For Double Equations"))

    if decession == 1 :
        singleIteration()
    # elif decession == 2 :
    #     multipleIteration()

    




def menu() :
    print("Welcome to Numerical Method\n")
    print("\n\t1.Input Equation ")
    print("\n\t2.Show Equation ")
    print("\n\t3.Add 2 Equation")
    print("\n\t4.Calculate result of a Equation")
    print("\n\t5.calculate Avg of some Equation ")
    print("\n\t6.calculate iteration table")
    
    choice = int(input("\n\n\tEnter your choice : "))
    return choice




def main() : 
    
    
    while True :
        choice = menu()

        if choice == 1 : 
            equations.append(InputEqua())
        elif choice == 2 :
            Show()
        elif choice == 3 :
            Add()
        elif choice == 4 :
            Calc()
        elif choice == 5 :
            avgEquation()
        elif choice == 6 :
            checkIteration()

        

        
main()

