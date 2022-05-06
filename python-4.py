name ="ABCDEEFGHI"
name.split()
s=[]
print(len(name))

for i in name:
    if i not in s:
        s.append(i)
    else:
        continue
print(*s)
