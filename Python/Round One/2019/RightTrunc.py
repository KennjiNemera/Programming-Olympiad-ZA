def isPrime(p):
  if(p < 2):
    return False
  x = 2
  while(x * x <= p):
    if (p % x == 0):
      return False
    x += 1
  return True


def isRightTrunc(n):
  while (n > 0):
    if not isPrime(n):
      return False
    n //= 10
  return True


# get the index from the user 
n = int(input('What index would you like to get: \n'))
i = 1
num = 0

while (num < n):
  if(isRightTrunc(i)):
    num += 1
  i += 1

print(i - 1)
