# Useless-words
A few useless words (English preps and conjs) to enhance readability of code.
I did it for fun only.

It removes the need of writing comments or looking into implementation to find out
what the code is doing, especially those taking more than 1 parameters.

## Example
Your previous method call for below:

```java
retrievedValue = dataManager.retrieve(anObject, aProperty);
dataManager.merge(anObject, anotherObject); // merge which with which?
dataManager.update(anObject, anotherObject); // update which to which?
dataManager.filter(aList, firstCriteria, secondCriteria);
```

will read like real sentences as below:

```java
retrievedValue = dataManager.retrieve(From(anObject), By(aProperty));
dataManager.merge(anObject, To(anotherObject));
dataManager.update(anObject, With(anotherObject));
dataManager.filter(aList, With(firstCriteria), And(secondCriteria));
```

It could be useful in your test cases when you try to write readable
test cases like normal sentences. It applies to legacy API as well,
if sometimes you are not able to modify even its name.

Use in real code with care. Your boss may shout at you.

p.s. it may fail checkstyle checks as all useless words starts with Capital letter
to avoid being recognized as reserved words.

Requires JDK 1.5 and above.