import sys

#read integer number n
try:
    n = int(sys.argv[1])
except:
    print("Not an integer")
    exit()

#Convert to binary
a = bin(n)[2:]
l = len(a)
#array of n added with itself
arr = [0 for i in range(l)]
arr[0] = n
for i in range(0,l-1):
    arr[i+1] = arr[i]+arr[i]
#Reverse the array
arr.reverse()
#compute square of number n
square = 0
for i in range(0,l):
    if (a[i] == '1'):
        square = square +arr[i]

print("Square = ",square)
