// Crow Ops. These are for doing crow stuff.

PTCrowOp : PTOp {
	// var server, quant, phase;

	*new { |name, nargs|
		^super.newCopyArgs(name)
	}

	min { ^0 }

	max { ^1 }

	rate { ^\control }

	alloc { |args, callsite|
		^[nil, nil]
	}
}
