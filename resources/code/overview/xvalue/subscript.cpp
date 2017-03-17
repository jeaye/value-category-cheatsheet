int a[4]{}; // lvalue
std::move(a); // xvalue
std::move(a)[2]; // xvalue

using arr = int[2];
arr{}; // prvalue
arr{}[0]; // xvalue
