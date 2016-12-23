struct foo
{ int a; };

foo f; // lvalue
std::move(f).a; // xvalue
foo{}.a; // xvalue
