angle1 = int(input('Enter angle 1: \n'))
angle2 = int(input('Enter angle 2: \n'))
angle3 = int(input('Enter angle 3: \n'))

if (angle1 + angle2 + angle3 != 180):
  print('IMPOSSIBLE')
elif (angle1 == angle2 and angle2 == angle3):
  print('EQUILATERAL')
elif (angle1 == angle2 or angle2 == angle3 or angle1 == angle3):
  print('ISOSCELES')
else:
  print('SCALENE')
