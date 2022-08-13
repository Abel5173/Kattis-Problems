s = input()
l = ['a', 'e', 'i', 'o', 'u']
a = ''
i = 0
while i < len(s):
    if s[i] in l:
        a += s[i]
        i += 2
    else:
        a += s[i]
    i += 1
print(a)
