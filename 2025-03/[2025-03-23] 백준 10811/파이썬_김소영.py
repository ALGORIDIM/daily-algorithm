n, m = map(int, input().split())

lis = [i for i in range(1, n+1)]
    
for i in range(m):
    j, a = map(int, input().split())
    
    numbers = lis[j-1:a]
    
    numbers.reverse()
    
    lis[j-1:a] = numbers
    
    
for i in range(n):
    print(lis[i], end=" ")
