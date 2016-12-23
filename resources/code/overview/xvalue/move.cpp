bool b{ true }; // lvalue
std::move(b); // xvalue
static_cast<bool&&>(b); // xvalue
