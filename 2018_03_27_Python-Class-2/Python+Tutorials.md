

```python
# Printing 
print("Hello World!")
print "Hello Again"
print("I like typing this.")
print "This is fun."
print 'Yay! Printing.'
print "I'd much rather you 'not'."
print 'I "said" do not touch this.'
```


      File "<ipython-input-12-3577acc6aaf8>", line 3
        print "Hello Again"
                          ^
    SyntaxError: Missing parentheses in call to 'print'




```python
# Comments in python
# Comment  -> 
# This is a comment
print("This is not a comment")
'''
multiple comment
print("Bucky" + "Roberts")
'''
```


```python
# Basic Operators - Knowledge box
    + plus
    - minus
    / slash
    * asterisk
    % percent
    < less-than
    > greater-than
    <= less-than-equal
    >= greater-than-equal
```


```python
print "I will now count my chickens:"

print "Hens", 25 + 30 / 6
print "Roosters", 100 - 25 * 3 % 4

print "Now I will count the eggs:"

print 3 + 2 + 1 - 5 + 4 % 2 - 1 / 4 + 6

print "Is it true that 3 + 2 < 5 - 7?"

print 3 + 2 < 5 - 7

print "What is 3 + 2?", 3 + 2
print "What is 5 - 7?", 5 - 7

print "Oh, that's why it's False."

print "How about some more."

print "Is it greater?", 5 > -2
print "Is it greater or equal?", 5 >= -2
print "Is it less or equal?", 5 <= -2
```


```python
# Variables
a = 10
print(a)
b = "Computer Club"
print(b)
num = 3.244
print(num)
```


```python
# Basic Commands - Execute on python terminal
print("hey now brown cow")

firstName = "Mohit "
firstName + "Khare"
firstName * 5
```


```python
# Accessing Characters via index
# >>> denotes python command line
>>> user = "Tuna McFish"
>>> user[0]
'T'
>>> user[5]
'M'
>>> user[-1]
'h'
>>> user[-3]
'i'
>>> user[2:7]
'na Mc'
>>> user[:7]
'Tuna Mc'
>>> user[2:]
'na McFish'
>>> user[:]
'Tuna McFish'
>>> print('dsadasd')
dsadasd
>>> len('dfjhf22893hfsdfjkasdf')
21
>>> len(user)
11
```


```python
# List in python
# list --> []
>>> players = [29, 58, 66, 71, 87]
>>> players[2]
66
>>> players[2] = 68
>>> players
[29, 58, 68, 71, 87]
>>> players + [90, 91, 98]
[29, 58, 68, 71, 87, 90, 91, 98]
>>> players
[29, 58, 68, 71, 87]
>>> players.append(120)
>>> players
[29, 58, 68, 71, 87, 120]
>>> players[:2]
[29, 58]
>>> players[:2] = [0, 0]
>>> players
[0, 0, 68, 71, 87, 120]
>>> players[:2] = []
>>> players
[68, 71, 87, 120]
>>> players[:] = []
>>> players
[]
```


```python
# If-Else conditions
# Note the syntax
# if condition :
#      statements
# else:
#      statements

age = 13

if age < 21:
    print("No beer for you!")

#name = "Lucy"
name = "Tommy D"
if name is "Bucky":
    print("Hey there Bucky")
elif name is "Lucy":
    print("What up Lucedawg")
elif name is "Sammy":
    print("What up Slammy")
else:
    print("Please sign up for the site!")
    
# Try for different ages , age = 27
```


```python
# Iterations in python
# food list and inside some items
foods = ['bacon', 'tuna', 'ham', 'snausages', 'beef']

for f in foods[:2]:
    print(f)
    print(len(f))
```


```python
# For , while loops
#from 0 to 10
for x in range(10):
    print(x)

print("")

#from 5 to 12
for x in range(5, 12):
    print(x)

print("")

#from 10 to 40 increment value 5
for x in range(10, 40, 5):
    print(x)

print("")

#While loop

buttcrack = 5

while(buttcrack < 10):
    print(buttcrack)
    buttcrack += 1
```


```python
magicNumber = 26

# ok this program find a magic number

for n in range(101):
    if n is magicNumber:
        print(n, "is the magic number ! ")
        break
    else:
        print(n)
```


```python
#Challenge
#Find the numbers whıch can dive 4 and 4 multiple(tetragenous) in from 0 to 100
for n in range(101):
    if(n % 4 is 0):
        print(n)
```


```python
numbersTaken = [2, 5, 12, 13, 17]

print("Here are the numbers that are still available")

for n in range(1,20):
    if n in numbersTaken:
        continue
    print(n)
```


```python
def beef():
    print("Dayum, functions are cool")


def bitcoin_to_usd(btc):
    amount = btc * 527
    print(amount)

beef()
bitcoin_to_usd(3.85)
bitcoin_to_usd(1)
bitcoin_to_usd(13)
```


```python
def allowed_dating_age(my_age):
    girls_age = (my_age/2)+7
    return girls_age

my_limit = allowed_dating_age(22)
creppy_limit = allowed_dating_age(49)
print("I can date girls", my_limit,"or older")
print("Creepy can date girls", creppy_limit,"or older")
```


```python
def get_gender(sex = 'Unknown'):
    if sex is 'm':
        sex = 'Male'
    elif sex is 'f':
        sex = 'Female'
    print(sex)

get_gender('m')
get_gender('f')
get_gender()
```


```python
a = 7823

def corn():
  print(a)


def fudge():
  print(a)

corn()
fudge()
```


```python
def dumb_sentence(name='Mohit', action='ate', item='pizza'):
  print(name, action, item)

dumb_sentence()
dumb_sentence("CC", "teaches", "coding")
dumb_sentence(item='burger')
dume_sentence(item='football', action='loves')
```


```python
def add_numbers(*args):
  total = 0
  for a in args:
    total += a
  print(total)

add_numbers(3)
add_numbers(3, 32)
add_numbers(3, 43, 5453, 354234, 463463)
```


```python
def health_calculator(age, apples_ate, cigs_smoked):
  answer = (100-age) + (apples_ate*3.5) - (cigs_smoked*2)
  print(answer)

data = [27, 20, 0]

health_calculator(data[0], data[1], data[2])
health_calculator(*data)
```


```python
groceries = {'cereal', 'milk', 'starcrunch', 'beer', 'duck tape', 'lotion', 'beer'}
print(groceries)

if 'milk' in groceries:
  print("You already have milk hoss!")
else:
  print("Oh yea, you need milk!")
```


```python
classmates = {'Tony': ' cool but smells', 'Emma': ' sits behind me', 'Lucy': ' asks too many questions'}

for k, v in classmates.items():
    print(k + v)
```


```python
import tuna_21
import random

tuna_21.fish()

x = random.randrange(1, 1000)
print(x)
```


```python
import random
import urllib.request

def download_web_image(url):
    name = random.randrange(1, 1000)
    full_name = str(name) + ".jpg"
    urllib.request.urlretrieve(url, full_name)

download_web_image("https://www.thenewboston.com/images/homepage_images/main_homepage_01.png")
```


```python
# Writing and Reading Files
fw = open('sample.txt', 'w')
fw.write('Writing some stuff in my text file\n')
fw.write('I like bacon\n')
fw.close()

fr = open('sample.txt', 'r')
text = fr.read()
print(text)
fr.close()
```


```python
from urllib import request

goog_url = http://real-chart.finance.yahoo.com/table.csv?s=GOOG&d=2&e=8&f=2015&g=d&a=2&b=27&c=2014&ignore=.csv

def download_stock_data(csv_url):
    response = request.urlopen(csv_url)
    csv = response.read()
    csv_str = str(csv)
    lines = csv_str.split("\\n")
    dest_url = r'goog.csv'
    fx = open(dest_url, "w")
    for line in lines:
        fx.write(line + "\n")
    fx.close()

download_stock_data(goog_url)
```


```python
while True:
    try:
        number = int(input("What's your fav number hoss?\n"))
        print(18/number)
        break
    except ValueError:
        print("Make sure and enter a number")
    except ZeroDivisionError:
        print("Don't pick zero")
    except:
        break
    finally:
        print("loop complete")
```


```python
class Enemy:
    life = 3
    
    def attack(self):
        print("ouch!")
        self.life -=1
    
    def checkLife(self):
        if self.life <= 0:
            print("I am dead")
        else:
            print(str(self.life) + " life left")

enemy1 = Enemy()
enemy2 = Enemy()

enemy1.attack()
enemy1.attack()
enemy1.checkLife()
enemy2.checkLife()
```


```python
class Enemy:
    def __init__(self, x):
        self.energy = x
    
    def get_energy(self):
        print(self.energy)

jason = Enemy(5)
sandy = Enemy(18)

jason.get_energy()
sandy.get_energy()
```


```python
class Girl:
    
    gender = 'female'
    
    def __init__(self, name):
        self.name = name

r = Girl('Rachel')
s = Girl('Stanky')
print(r.gender)
print(s.gender)
print(r.name)
print(s.name)
```


```python
class Parent:
    
    def print_last_name(self):
        print('Roberts')
    

class Child(Parent):
    
    def print_first_name(self):
        print('Bucky')
    
    def print_last_name(self):
        print('Snitzleberg')

bucky = Child()
bucky.print_first_name()
bucky.print_last_name()
```


```python
class Mario():
    
    def move(self):
        print('I am moving!')


class Shroom():
    
    def eat_shroom(self):
        print('Now I am big!')


class BigMario(Mario, Shroom):
    pass

bm = BigMario()
bm.move()
bm.eat_shroom()
```


```python
def drop_first_last(grades):
    first, *middle, last = grades
    avg = sum(middle) / len(middle)
    print(avg)

drop_first_last([65, 76, 98, 54, 21])
drop_first_last([65, 76, 98, 54, 21, 54, 65, 99, 88, 78])
```


```python
first = ['Mohit', 'Abhey', 'Akshay']
last = ['Khare', 'Rana', 'Sharma']

names = zip(first, last)

for a, b in names:
    print(a, b)
```


```python
answer = lambda x: x*7
print(answer(5))
```
