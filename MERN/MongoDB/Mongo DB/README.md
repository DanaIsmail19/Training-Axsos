# MongoDB Student Collection Operations

This document describes the series of operations performed on a MongoDB database called `my_first_db`. These operations involve creating and modifying a collection named `students`, where each document represents a student with various fields such as `name`, `home_state`, `lucky_number`, `birthday`, and additional fields such as `interests`, `belts_earned`, and `updated_on`.

---

## Database and Collection Setup

### 1. Create Database

- Database Name: `my_first_db`
- Collection Name: `students`
- The collection is created when the first document is inserted.

### 2. Insert Students

- Five students were inserted into the `students` collection. Each student document contains the following fields:
  - `name`: String
  - `home_state`: String
  - `lucky_number`: Number
  - `birthday`: Embedded document with fields `month`, `day`, and `year`.

## Operations Performed

### 3. Add an `interests` Array

- An `interests` field was added to each student document. This field is an array containing the entries: `coding`, `brunch`, and `MongoDB`.
- Additional unique interests were added to each student's `interests` array.

### 4. Modify the `interests` Array

- The interest `taxes` was added to a student's `interests` array and subsequently removed.

### 5. Remove Students Based on Conditions

- All students from California were removed from the collection.
- A specific student was removed by their name.
- A student whose `lucky_number` is greater than 5 was removed, with only one match being deleted.

### 6. Add and Modify Fields

- A field called `number_of_belts` was added to each student document and initialized to 0.
- For students in Washington (Seattle Dojo), the `number_of_belts` field was incremented by 1.
- The `number_of_belts` field was renamed to `belts_earned`.
- The `lucky_number` field was removed from all documents.
- An `updated_on` field was added, storing the date and time when the document was last modified.

## Commands Overview

### Insert Example Students

db.students.insertMany([
{name: "Dana Ismail", home_state: "Palestine", lucky_number: 24, birthday: {month: 5, day: 2, year: 2013}},
{name: "Reem Hanoun", home_state: "Ramallah", lucky_number: 22, birthday: {month: 8, day: 12, year: 2000}}
])

### Update with Interests Array

db.students.updateMany({}, {$set: {interests: ["coding", "brunch", "MongoDB"]}})

### Add Unique Interests

db.students.updateOne({name: "Dana Ismail"}, {$push: {interests: {$each: ["painting", "reading"]}}})
db.students.updateOne({name: "Reem Hanoun"}, {$push: {interests: {$each: ["hiking", "photography"]}}})

### Modify Interests

Add `taxes`:

db.students.updateOne({name: "Dana Ismail"}, {$push: {interests: "taxes"}})

Remove `taxes`:

db.students.updateOne({name: "Dana Ismail"}, {$pull: {interests: "taxes"}})

### Remove Students

By state:

db.students.deleteMany({home_state: "California"})

By name:

db.students.deleteOne({name: "Reem Hanoun"})

By lucky number (greater than 5):

db.students.deleteOne({lucky_number: {$gt: 5}})

### Add and Modify Fields

Add `number_of_belts`:

db.students.updateMany({}, {$set: {number_of_belts: 0}})

Increment `number_of_belts` for Washington students:

db.students.updateMany({home_state: "Washington"}, {$inc: {number_of_belts: 1}})

Rename field:

db.students.updateMany({}, {$rename: {"number_of_belts": "belts_earned"}})

Remove `lucky_number`:

db.students.updateMany({}, {$unset: {lucky_number: ""}})

Add `updated_on` field:

db.students.updateMany({}, {$set: {updated_on: new Date()}})
