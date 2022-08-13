s = input()
isChanged = True
for i in s:
    if s.count(i) >= 2:
        isChanged = False
        print(0)
        break
if isChanged:
    print(1)
