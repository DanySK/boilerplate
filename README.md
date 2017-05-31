# Boilerplate

Collection of boilerplate code that should ease writing Java 8+ code

## Status

### Stable branch

[![Build Status](https://travis-ci.org/DanySK/boilerplate.svg?branch=master)](https://travis-ci.org/DanySK/boilerplate)

### Development branch

[![Build Status](https://travis-ci.org/DanySK/boilerplate.svg?branch=develop)](https://travis-ci.org/DanySK/boilerplate)

## Usage

### `Hashes`

Murmur3-based hashing for arbitrary objects.

### `FastReadWriteLock`

Implements a multiple-reader / single-writer lock relying on a single semaphore. Writers lock with `write()`, readers lock with `read()`. Both release the lock with `release()`. The lock must be used correctly by the programmer (releases made randomly are unchecked, and will break the locking system). Non-reentrant (calling `write()` twice produces a deadlock).

### `PrimitiveArrays`

A set of utility methods for changing (through copy) the type of arrays. Allows for both widening and narrowing "casts" (with precision loss).

### `Streams.flatten`

Flattens a recursive, hierarchical data structure to a `Stream`.

For instance:
``` java
Tree tree = new MyTree();
TreeNode root = tree.getRoot();
Stream<TreeNode> s = Streams.flatten(root, t -> t.getChildren().stream())
```
Would traverse the tree breadth-first.

### `SmallestN`

A collector that efficiently selects the desired number of smallest elements from the stream.
Returns a Guava `MinMaxPriorityQueue`, that is used to efficiently store only the required elements.
This collector has in general better performance than the equivalent `.sort().limit().collect()` chain.

## Import in your project

I warmly suggest to use Gradle, Maven or a similar system to deal with dependencies within your project. In this case, you can use this product by importing the following Maven dependency:

```xml
<dependency>
    <groupId>org.danilopianini</groupId>
    <artifactId>boilerplate</artifactId>
    <version>VERSION_YOU_WANT_TO_USE</version>
</dependency>
```

or the following Gradle dependency:

```Gradle
compile 'org.danilopianini:stream-goodies:VERSION_YOU_WANT_TO_USE'
```

Alternatively, you can grab the latest jar and throw it in your classpath. In this case, be sure to include the dependencies of this project in your classpath as well.


