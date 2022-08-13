n=input()
a=str
#for i in range(4):
a=str(f"{int(n[0]):04b}")
b=a
for i in range(1,4):
    a=str(f"{int(n[i]):04b}")
    b= b+a
for i in range(0,4):
    for j in range(i,16,4):
        if b[j]=='1':
            if j%4==1:
                print('* ',end='')
            else:
                print('*',end='')
        else:
            if j%4==1:
                print('. ',end='')
            else:
                print('.',end='')
    print()

