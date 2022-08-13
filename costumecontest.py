n = int(input())
l = []
index = []
ls = {}
ls = set()
for i in range(n):
    a = input()
    l.append(a)

for i in l:
    b = l.count(i)
    index.append(b)
x = min(index)
for i in l:
    if l.count(i) == x:
        ls.add(i)

for i in ls:
    print(i)
