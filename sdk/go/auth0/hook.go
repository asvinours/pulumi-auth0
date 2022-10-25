// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Hooks are secure, self-contained functions that allow you to customize the behavior of Auth0 when executed for selected extensibility points of the Auth0 platform. Auth0 invokes Hooks during runtime to execute your custom Node.js code. Depending on the extensibility point, you can use Hooks with Database Connections and/or Passwordless Connections.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-auth0/sdk/v2/go/auth0"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := auth0.NewHook(ctx, "myHook", &auth0.HookArgs{
//				Dependencies: pulumi.AnyMap{
//					"auth0": pulumi.Any("2.30.0"),
//				},
//				Enabled: pulumi.Bool(true),
//				Script:  pulumi.String(fmt.Sprintf("    function (user, context, callback) {\n      callback(null, { user });\n    }\n  \n")),
//				Secrets: pulumi.AnyMap{
//					"foo": pulumi.Any("bar"),
//				},
//				TriggerId: pulumi.String("pre-user-registration"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// # A hook can be imported using the hook's ID. # # Example
//
// ```sh
//
//	$ pulumi import auth0:index/hook:Hook my_hook 00001
//
// ```
type Hook struct {
	pulumi.CustomResourceState

	// Dependencies of this hook used by the WebTask server.
	Dependencies pulumi.MapOutput `pulumi:"dependencies"`
	// Whether the hook is enabled, or disabled.
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// Name of this hook.
	Name pulumi.StringOutput `pulumi:"name"`
	// Code to be executed when this hook runs.
	Script pulumi.StringOutput `pulumi:"script"`
	// The secrets associated with the hook.
	Secrets pulumi.MapOutput `pulumi:"secrets"`
	// Execution stage of this rule. Can be credentials-exchange, pre-user-registration, post-user-registration, post-change-password, or send-phone-message.
	TriggerId pulumi.StringOutput `pulumi:"triggerId"`
}

// NewHook registers a new resource with the given unique name, arguments, and options.
func NewHook(ctx *pulumi.Context,
	name string, args *HookArgs, opts ...pulumi.ResourceOption) (*Hook, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Script == nil {
		return nil, errors.New("invalid value for required argument 'Script'")
	}
	if args.TriggerId == nil {
		return nil, errors.New("invalid value for required argument 'TriggerId'")
	}
	var resource Hook
	err := ctx.RegisterResource("auth0:index/hook:Hook", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetHook gets an existing Hook resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetHook(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *HookState, opts ...pulumi.ResourceOption) (*Hook, error) {
	var resource Hook
	err := ctx.ReadResource("auth0:index/hook:Hook", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Hook resources.
type hookState struct {
	// Dependencies of this hook used by the WebTask server.
	Dependencies map[string]interface{} `pulumi:"dependencies"`
	// Whether the hook is enabled, or disabled.
	Enabled *bool `pulumi:"enabled"`
	// Name of this hook.
	Name *string `pulumi:"name"`
	// Code to be executed when this hook runs.
	Script *string `pulumi:"script"`
	// The secrets associated with the hook.
	Secrets map[string]interface{} `pulumi:"secrets"`
	// Execution stage of this rule. Can be credentials-exchange, pre-user-registration, post-user-registration, post-change-password, or send-phone-message.
	TriggerId *string `pulumi:"triggerId"`
}

type HookState struct {
	// Dependencies of this hook used by the WebTask server.
	Dependencies pulumi.MapInput
	// Whether the hook is enabled, or disabled.
	Enabled pulumi.BoolPtrInput
	// Name of this hook.
	Name pulumi.StringPtrInput
	// Code to be executed when this hook runs.
	Script pulumi.StringPtrInput
	// The secrets associated with the hook.
	Secrets pulumi.MapInput
	// Execution stage of this rule. Can be credentials-exchange, pre-user-registration, post-user-registration, post-change-password, or send-phone-message.
	TriggerId pulumi.StringPtrInput
}

func (HookState) ElementType() reflect.Type {
	return reflect.TypeOf((*hookState)(nil)).Elem()
}

type hookArgs struct {
	// Dependencies of this hook used by the WebTask server.
	Dependencies map[string]interface{} `pulumi:"dependencies"`
	// Whether the hook is enabled, or disabled.
	Enabled *bool `pulumi:"enabled"`
	// Name of this hook.
	Name *string `pulumi:"name"`
	// Code to be executed when this hook runs.
	Script string `pulumi:"script"`
	// The secrets associated with the hook.
	Secrets map[string]interface{} `pulumi:"secrets"`
	// Execution stage of this rule. Can be credentials-exchange, pre-user-registration, post-user-registration, post-change-password, or send-phone-message.
	TriggerId string `pulumi:"triggerId"`
}

// The set of arguments for constructing a Hook resource.
type HookArgs struct {
	// Dependencies of this hook used by the WebTask server.
	Dependencies pulumi.MapInput
	// Whether the hook is enabled, or disabled.
	Enabled pulumi.BoolPtrInput
	// Name of this hook.
	Name pulumi.StringPtrInput
	// Code to be executed when this hook runs.
	Script pulumi.StringInput
	// The secrets associated with the hook.
	Secrets pulumi.MapInput
	// Execution stage of this rule. Can be credentials-exchange, pre-user-registration, post-user-registration, post-change-password, or send-phone-message.
	TriggerId pulumi.StringInput
}

func (HookArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*hookArgs)(nil)).Elem()
}

type HookInput interface {
	pulumi.Input

	ToHookOutput() HookOutput
	ToHookOutputWithContext(ctx context.Context) HookOutput
}

func (*Hook) ElementType() reflect.Type {
	return reflect.TypeOf((**Hook)(nil)).Elem()
}

func (i *Hook) ToHookOutput() HookOutput {
	return i.ToHookOutputWithContext(context.Background())
}

func (i *Hook) ToHookOutputWithContext(ctx context.Context) HookOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HookOutput)
}

// HookArrayInput is an input type that accepts HookArray and HookArrayOutput values.
// You can construct a concrete instance of `HookArrayInput` via:
//
//	HookArray{ HookArgs{...} }
type HookArrayInput interface {
	pulumi.Input

	ToHookArrayOutput() HookArrayOutput
	ToHookArrayOutputWithContext(context.Context) HookArrayOutput
}

type HookArray []HookInput

func (HookArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Hook)(nil)).Elem()
}

func (i HookArray) ToHookArrayOutput() HookArrayOutput {
	return i.ToHookArrayOutputWithContext(context.Background())
}

func (i HookArray) ToHookArrayOutputWithContext(ctx context.Context) HookArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HookArrayOutput)
}

// HookMapInput is an input type that accepts HookMap and HookMapOutput values.
// You can construct a concrete instance of `HookMapInput` via:
//
//	HookMap{ "key": HookArgs{...} }
type HookMapInput interface {
	pulumi.Input

	ToHookMapOutput() HookMapOutput
	ToHookMapOutputWithContext(context.Context) HookMapOutput
}

type HookMap map[string]HookInput

func (HookMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Hook)(nil)).Elem()
}

func (i HookMap) ToHookMapOutput() HookMapOutput {
	return i.ToHookMapOutputWithContext(context.Background())
}

func (i HookMap) ToHookMapOutputWithContext(ctx context.Context) HookMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(HookMapOutput)
}

type HookOutput struct{ *pulumi.OutputState }

func (HookOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Hook)(nil)).Elem()
}

func (o HookOutput) ToHookOutput() HookOutput {
	return o
}

func (o HookOutput) ToHookOutputWithContext(ctx context.Context) HookOutput {
	return o
}

// Dependencies of this hook used by the WebTask server.
func (o HookOutput) Dependencies() pulumi.MapOutput {
	return o.ApplyT(func(v *Hook) pulumi.MapOutput { return v.Dependencies }).(pulumi.MapOutput)
}

// Whether the hook is enabled, or disabled.
func (o HookOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *Hook) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// Name of this hook.
func (o HookOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Hook) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Code to be executed when this hook runs.
func (o HookOutput) Script() pulumi.StringOutput {
	return o.ApplyT(func(v *Hook) pulumi.StringOutput { return v.Script }).(pulumi.StringOutput)
}

// The secrets associated with the hook.
func (o HookOutput) Secrets() pulumi.MapOutput {
	return o.ApplyT(func(v *Hook) pulumi.MapOutput { return v.Secrets }).(pulumi.MapOutput)
}

// Execution stage of this rule. Can be credentials-exchange, pre-user-registration, post-user-registration, post-change-password, or send-phone-message.
func (o HookOutput) TriggerId() pulumi.StringOutput {
	return o.ApplyT(func(v *Hook) pulumi.StringOutput { return v.TriggerId }).(pulumi.StringOutput)
}

type HookArrayOutput struct{ *pulumi.OutputState }

func (HookArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Hook)(nil)).Elem()
}

func (o HookArrayOutput) ToHookArrayOutput() HookArrayOutput {
	return o
}

func (o HookArrayOutput) ToHookArrayOutputWithContext(ctx context.Context) HookArrayOutput {
	return o
}

func (o HookArrayOutput) Index(i pulumi.IntInput) HookOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Hook {
		return vs[0].([]*Hook)[vs[1].(int)]
	}).(HookOutput)
}

type HookMapOutput struct{ *pulumi.OutputState }

func (HookMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Hook)(nil)).Elem()
}

func (o HookMapOutput) ToHookMapOutput() HookMapOutput {
	return o
}

func (o HookMapOutput) ToHookMapOutputWithContext(ctx context.Context) HookMapOutput {
	return o
}

func (o HookMapOutput) MapIndex(k pulumi.StringInput) HookOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Hook {
		return vs[0].(map[string]*Hook)[vs[1].(string)]
	}).(HookOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*HookInput)(nil)).Elem(), &Hook{})
	pulumi.RegisterInputType(reflect.TypeOf((*HookArrayInput)(nil)).Elem(), HookArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*HookMapInput)(nil)).Elem(), HookMap{})
	pulumi.RegisterOutputType(HookOutput{})
	pulumi.RegisterOutputType(HookArrayOutput{})
	pulumi.RegisterOutputType(HookMapOutput{})
}
