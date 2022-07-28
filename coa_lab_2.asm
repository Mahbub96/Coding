.data 
prompt1: .asciiz "Enter the first number : "
prompt2: .asciiz "Enter the Second number : "
prompt3: .asciiz "Enter the third number : "
menu: .asciiz "Enter the number assosiated with the operation you want to perform : 1=> add, 2=> subtract, 3=> multiply or 4=> division:  "
resultText: .asciiz "Your final result is : "

.text 
.globl main
main: 
# The following block of code is to pre-load integer values representing the various instraction into reg

li $t3,1 # to load the 
li $t4,2
li $t5,3
li $t7,4

#input 1
li $v0, 4
la $a0,prompt1
syscall

li $v0,5
syscall
move $t0,$v0

#input 2        
li $v0, 4
la $a0,prompt2
syscall

li $v0,5
syscall
move $t1,$v0


#input 3        
li $v0, 4
la $a0,prompt3
syscall

li $v0,5
syscall
move $t8,$v0


li $v0, 4
la $a0, menu
syscall

li $v0, 5
syscall
move $t2, $v0



beq $t2, $t3, addition
beq $t2, $t4, substraction
beq $t2, $t5, multiplication
beq $t2, $t7, division



addition:
	add $t6, $t0, $t1
	add $t6, $t6, $t8


	li $v0, 4
	la $a0, resultText
	syscall

	j resultShow

substraction:
 	sub $t6, $t0, $t1
	sub $t6, $t6, $t8

	li $v0, 4
	la $a0, resultText
	syscall

	j resultShow

multiplication:
 	mul $t6,$t0, $t1
	mul $t6,$t6, $t8
	
	li $v0, 4
	la $a0, resultText
	syscall

	j resultShow

division:
	div $t6,$t0, $t1
	div $t6,$t6, $t8
	
	
	li $v0, 4
	la $a0, resultText
	syscall

	j resultShow

resultShow:
	li $v0, 1
	la $a0, ($t6)
	syscall
	li $v0, 10
	syscall
		
