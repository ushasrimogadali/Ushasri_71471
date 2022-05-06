arr=[1,2,3,4,5,6,7,8,9,10]
arr1=[2,3,5,6,7,2]
k=[]
s=[]
even=[]
odd=[]
neg=[]
pos=[]
zero=[]
for i in arr:
    if i in arr1:
        k.append(i)
    else:
        s.append(i)
print(k)
print(s)
for i in arr:
    if i%2==0:
        even.append(i)
    elif i<0:
        neg.append(i)
    elif i>0:
        pos.append(i)
    elif i==0:
        zero.append(i)
    else:
        odd.append(i)
print(even)
print(odd)
print(pos)
print(neg)
print(zero)
