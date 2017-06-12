# Boilerplate

Collection of boilerplate code that should ease writing Java 8+ code

## Status

### Stable branch

[![Build Status](https://travis-ci.org/DanySK/boilerplate.svg?branch=master)](https://travis-ci.org/DanySK/boilerplate)

### Development branch

[![Build Status](https://travis-ci.org/DanySK/boilerplate.svg?branch=develop)](https://travis-ci.org/DanySK/boilerplate)

## Usage

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

### `FastReadWriteLock`

A Semaphore-based read-write lock that allows multiple readings or a single writing.

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
compile 'org.danilopianini:boilerplate:VERSION_YOU_WANT_TO_USE'
```

Alternatively, you can grab the latest jar and throw it in your classpath. In this case, be sure to include the dependencies of this project in your classpath as well.


