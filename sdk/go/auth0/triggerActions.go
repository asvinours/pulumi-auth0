// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package auth0

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-auth0/sdk/v2/go/auth0/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// With this resource, you can bind actions to a trigger. Once actions are created and deployed, they can be attached (i.e. bound) to a trigger so that it will be executed as part of a flow. The list of actions reflects the order in which they will be executed during the appropriate flow.
//
// !> This resource manages all the action bindings to a trigger. In contrast, the `TriggerAction` resource only
// appends an action to the trigger binding. To avoid potential issues, it is recommended not to use this resource in
// conjunction with the `TriggerAction` resource when binding actions to the same trigger.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-auth0/sdk/v2/go/auth0"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			actionFoo, err := auth0.NewAction(ctx, "actionFoo", &auth0.ActionArgs{
//				Code:   pulumi.String("exports.onContinuePostLogin = async (event, api) => {\n  console.log(\"foo\");\n};\"\n"),
//				Deploy: pulumi.Bool(true),
//				SupportedTriggers: &auth0.ActionSupportedTriggersArgs{
//					Id:      pulumi.String("post-login"),
//					Version: pulumi.String("v3"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			actionBar, err := auth0.NewAction(ctx, "actionBar", &auth0.ActionArgs{
//				Code:   pulumi.String("exports.onContinuePostLogin = async (event, api) => {\n  console.log(\"bar\");\n};\"\n"),
//				Deploy: pulumi.Bool(true),
//				SupportedTriggers: &auth0.ActionSupportedTriggersArgs{
//					Id:      pulumi.String("post-login"),
//					Version: pulumi.String("v3"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = auth0.NewTriggerActions(ctx, "loginFlow", &auth0.TriggerActionsArgs{
//				Trigger: pulumi.String("post-login"),
//				Actions: auth0.TriggerActionsActionArray{
//					&auth0.TriggerActionsActionArgs{
//						Id:          actionFoo.ID(),
//						DisplayName: actionFoo.Name,
//					},
//					&auth0.TriggerActionsActionArgs{
//						Id:          actionBar.ID(),
//						DisplayName: actionBar.Name,
//					},
//				},
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
// This resource can be imported using the bindings trigger ID. # Example
//
// ```sh
//
//	$ pulumi import auth0:index/triggerActions:TriggerActions example "post-login"
//
// ```
type TriggerActions struct {
	pulumi.CustomResourceState

	// The list of actions bound to this trigger.
	Actions TriggerActionsActionArrayOutput `pulumi:"actions"`
	// The ID of the trigger to bind with.
	Trigger pulumi.StringOutput `pulumi:"trigger"`
}

// NewTriggerActions registers a new resource with the given unique name, arguments, and options.
func NewTriggerActions(ctx *pulumi.Context,
	name string, args *TriggerActionsArgs, opts ...pulumi.ResourceOption) (*TriggerActions, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Actions == nil {
		return nil, errors.New("invalid value for required argument 'Actions'")
	}
	if args.Trigger == nil {
		return nil, errors.New("invalid value for required argument 'Trigger'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource TriggerActions
	err := ctx.RegisterResource("auth0:index/triggerActions:TriggerActions", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetTriggerActions gets an existing TriggerActions resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetTriggerActions(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *TriggerActionsState, opts ...pulumi.ResourceOption) (*TriggerActions, error) {
	var resource TriggerActions
	err := ctx.ReadResource("auth0:index/triggerActions:TriggerActions", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering TriggerActions resources.
type triggerActionsState struct {
	// The list of actions bound to this trigger.
	Actions []TriggerActionsAction `pulumi:"actions"`
	// The ID of the trigger to bind with.
	Trigger *string `pulumi:"trigger"`
}

type TriggerActionsState struct {
	// The list of actions bound to this trigger.
	Actions TriggerActionsActionArrayInput
	// The ID of the trigger to bind with.
	Trigger pulumi.StringPtrInput
}

func (TriggerActionsState) ElementType() reflect.Type {
	return reflect.TypeOf((*triggerActionsState)(nil)).Elem()
}

type triggerActionsArgs struct {
	// The list of actions bound to this trigger.
	Actions []TriggerActionsAction `pulumi:"actions"`
	// The ID of the trigger to bind with.
	Trigger string `pulumi:"trigger"`
}

// The set of arguments for constructing a TriggerActions resource.
type TriggerActionsArgs struct {
	// The list of actions bound to this trigger.
	Actions TriggerActionsActionArrayInput
	// The ID of the trigger to bind with.
	Trigger pulumi.StringInput
}

func (TriggerActionsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*triggerActionsArgs)(nil)).Elem()
}

type TriggerActionsInput interface {
	pulumi.Input

	ToTriggerActionsOutput() TriggerActionsOutput
	ToTriggerActionsOutputWithContext(ctx context.Context) TriggerActionsOutput
}

func (*TriggerActions) ElementType() reflect.Type {
	return reflect.TypeOf((**TriggerActions)(nil)).Elem()
}

func (i *TriggerActions) ToTriggerActionsOutput() TriggerActionsOutput {
	return i.ToTriggerActionsOutputWithContext(context.Background())
}

func (i *TriggerActions) ToTriggerActionsOutputWithContext(ctx context.Context) TriggerActionsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TriggerActionsOutput)
}

// TriggerActionsArrayInput is an input type that accepts TriggerActionsArray and TriggerActionsArrayOutput values.
// You can construct a concrete instance of `TriggerActionsArrayInput` via:
//
//	TriggerActionsArray{ TriggerActionsArgs{...} }
type TriggerActionsArrayInput interface {
	pulumi.Input

	ToTriggerActionsArrayOutput() TriggerActionsArrayOutput
	ToTriggerActionsArrayOutputWithContext(context.Context) TriggerActionsArrayOutput
}

type TriggerActionsArray []TriggerActionsInput

func (TriggerActionsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TriggerActions)(nil)).Elem()
}

func (i TriggerActionsArray) ToTriggerActionsArrayOutput() TriggerActionsArrayOutput {
	return i.ToTriggerActionsArrayOutputWithContext(context.Background())
}

func (i TriggerActionsArray) ToTriggerActionsArrayOutputWithContext(ctx context.Context) TriggerActionsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TriggerActionsArrayOutput)
}

// TriggerActionsMapInput is an input type that accepts TriggerActionsMap and TriggerActionsMapOutput values.
// You can construct a concrete instance of `TriggerActionsMapInput` via:
//
//	TriggerActionsMap{ "key": TriggerActionsArgs{...} }
type TriggerActionsMapInput interface {
	pulumi.Input

	ToTriggerActionsMapOutput() TriggerActionsMapOutput
	ToTriggerActionsMapOutputWithContext(context.Context) TriggerActionsMapOutput
}

type TriggerActionsMap map[string]TriggerActionsInput

func (TriggerActionsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TriggerActions)(nil)).Elem()
}

func (i TriggerActionsMap) ToTriggerActionsMapOutput() TriggerActionsMapOutput {
	return i.ToTriggerActionsMapOutputWithContext(context.Background())
}

func (i TriggerActionsMap) ToTriggerActionsMapOutputWithContext(ctx context.Context) TriggerActionsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(TriggerActionsMapOutput)
}

type TriggerActionsOutput struct{ *pulumi.OutputState }

func (TriggerActionsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**TriggerActions)(nil)).Elem()
}

func (o TriggerActionsOutput) ToTriggerActionsOutput() TriggerActionsOutput {
	return o
}

func (o TriggerActionsOutput) ToTriggerActionsOutputWithContext(ctx context.Context) TriggerActionsOutput {
	return o
}

// The list of actions bound to this trigger.
func (o TriggerActionsOutput) Actions() TriggerActionsActionArrayOutput {
	return o.ApplyT(func(v *TriggerActions) TriggerActionsActionArrayOutput { return v.Actions }).(TriggerActionsActionArrayOutput)
}

// The ID of the trigger to bind with.
func (o TriggerActionsOutput) Trigger() pulumi.StringOutput {
	return o.ApplyT(func(v *TriggerActions) pulumi.StringOutput { return v.Trigger }).(pulumi.StringOutput)
}

type TriggerActionsArrayOutput struct{ *pulumi.OutputState }

func (TriggerActionsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*TriggerActions)(nil)).Elem()
}

func (o TriggerActionsArrayOutput) ToTriggerActionsArrayOutput() TriggerActionsArrayOutput {
	return o
}

func (o TriggerActionsArrayOutput) ToTriggerActionsArrayOutputWithContext(ctx context.Context) TriggerActionsArrayOutput {
	return o
}

func (o TriggerActionsArrayOutput) Index(i pulumi.IntInput) TriggerActionsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *TriggerActions {
		return vs[0].([]*TriggerActions)[vs[1].(int)]
	}).(TriggerActionsOutput)
}

type TriggerActionsMapOutput struct{ *pulumi.OutputState }

func (TriggerActionsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*TriggerActions)(nil)).Elem()
}

func (o TriggerActionsMapOutput) ToTriggerActionsMapOutput() TriggerActionsMapOutput {
	return o
}

func (o TriggerActionsMapOutput) ToTriggerActionsMapOutputWithContext(ctx context.Context) TriggerActionsMapOutput {
	return o
}

func (o TriggerActionsMapOutput) MapIndex(k pulumi.StringInput) TriggerActionsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *TriggerActions {
		return vs[0].(map[string]*TriggerActions)[vs[1].(string)]
	}).(TriggerActionsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*TriggerActionsInput)(nil)).Elem(), &TriggerActions{})
	pulumi.RegisterInputType(reflect.TypeOf((*TriggerActionsArrayInput)(nil)).Elem(), TriggerActionsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*TriggerActionsMapInput)(nil)).Elem(), TriggerActionsMap{})
	pulumi.RegisterOutputType(TriggerActionsOutput{})
	pulumi.RegisterOutputType(TriggerActionsArrayOutput{})
	pulumi.RegisterOutputType(TriggerActionsMapOutput{})
}
