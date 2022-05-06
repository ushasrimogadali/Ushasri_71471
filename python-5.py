ata="ABCDEFGHIJKLMNOPQURST";
s=['A','E','I','O','U']
k=[]
l=[]
for i in ata:
    if i in s:
        k.append(i)
    else:
        l.append(i)
print("vowels: ",*k)
print("consonants: ",*l)
