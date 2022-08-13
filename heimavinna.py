s = input()
l = list(s.split(';'))
sum = 0
for i in l:
    if i.count('-'):
        a = list(i.split('-'))
        sum += (int(a[-1])-int(a[0])+1)
    else:
        sum += 1
print(sum)
