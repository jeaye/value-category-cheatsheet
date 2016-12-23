bool b{ true }; // lvalue
std::move(b); // xvalue
static_cast&lt;bool&&&gt;(b); // xvalue
