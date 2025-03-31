# 첫째 줄에 정수의 개수 N을 입력받는다.
n = int(input())

# 둘째 줄에 공백으로 구분된 N개의 정수를 입력받아 리스트로 만든다.
numbers = list(map(int, input().split()))

# 셋째 줄에 찾으려고 하는 정수 v를 입력받는다.
v = int(input())

# 리스트에서 정수 v의 개수를 세는 변수를 초기화한다.
count = 0

# 리스트의 각 요소를 순회하면서 v와 같은지 확인한다.
for number in numbers:
    if number == v:
        count += 1

# 찾은 정수 v의 개수를 출력한다.
print(count)
