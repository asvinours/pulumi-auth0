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

// With this resource, you can manage all of a user's permissions.
//
// !> This resource manages all the permissions assigned to a user. In contrast, the `UserPermission` resource only
// appends a permissions to a user. To avoid potential issues, it is recommended not to use this resource in conjunction
// with the `UserPermission` resource when managing permissions for the same user id.
//
// ## Import
//
// # This resource can be imported by specifying the user ID Example
//
// ```sh
//
//	$ pulumi import auth0:index/userPermissions:UserPermissions all_user_permissions "auth0|111111111111111111111111"
//
// ```
type UserPermissions struct {
	pulumi.CustomResourceState

	// List of API permissions granted to the user.
	Permissions UserPermissionsPermissionArrayOutput `pulumi:"permissions"`
	// ID of the user to associate the permission to.
	UserId pulumi.StringOutput `pulumi:"userId"`
}

// NewUserPermissions registers a new resource with the given unique name, arguments, and options.
func NewUserPermissions(ctx *pulumi.Context,
	name string, args *UserPermissionsArgs, opts ...pulumi.ResourceOption) (*UserPermissions, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Permissions == nil {
		return nil, errors.New("invalid value for required argument 'Permissions'")
	}
	if args.UserId == nil {
		return nil, errors.New("invalid value for required argument 'UserId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource UserPermissions
	err := ctx.RegisterResource("auth0:index/userPermissions:UserPermissions", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetUserPermissions gets an existing UserPermissions resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetUserPermissions(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *UserPermissionsState, opts ...pulumi.ResourceOption) (*UserPermissions, error) {
	var resource UserPermissions
	err := ctx.ReadResource("auth0:index/userPermissions:UserPermissions", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering UserPermissions resources.
type userPermissionsState struct {
	// List of API permissions granted to the user.
	Permissions []UserPermissionsPermission `pulumi:"permissions"`
	// ID of the user to associate the permission to.
	UserId *string `pulumi:"userId"`
}

type UserPermissionsState struct {
	// List of API permissions granted to the user.
	Permissions UserPermissionsPermissionArrayInput
	// ID of the user to associate the permission to.
	UserId pulumi.StringPtrInput
}

func (UserPermissionsState) ElementType() reflect.Type {
	return reflect.TypeOf((*userPermissionsState)(nil)).Elem()
}

type userPermissionsArgs struct {
	// List of API permissions granted to the user.
	Permissions []UserPermissionsPermission `pulumi:"permissions"`
	// ID of the user to associate the permission to.
	UserId string `pulumi:"userId"`
}

// The set of arguments for constructing a UserPermissions resource.
type UserPermissionsArgs struct {
	// List of API permissions granted to the user.
	Permissions UserPermissionsPermissionArrayInput
	// ID of the user to associate the permission to.
	UserId pulumi.StringInput
}

func (UserPermissionsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*userPermissionsArgs)(nil)).Elem()
}

type UserPermissionsInput interface {
	pulumi.Input

	ToUserPermissionsOutput() UserPermissionsOutput
	ToUserPermissionsOutputWithContext(ctx context.Context) UserPermissionsOutput
}

func (*UserPermissions) ElementType() reflect.Type {
	return reflect.TypeOf((**UserPermissions)(nil)).Elem()
}

func (i *UserPermissions) ToUserPermissionsOutput() UserPermissionsOutput {
	return i.ToUserPermissionsOutputWithContext(context.Background())
}

func (i *UserPermissions) ToUserPermissionsOutputWithContext(ctx context.Context) UserPermissionsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserPermissionsOutput)
}

// UserPermissionsArrayInput is an input type that accepts UserPermissionsArray and UserPermissionsArrayOutput values.
// You can construct a concrete instance of `UserPermissionsArrayInput` via:
//
//	UserPermissionsArray{ UserPermissionsArgs{...} }
type UserPermissionsArrayInput interface {
	pulumi.Input

	ToUserPermissionsArrayOutput() UserPermissionsArrayOutput
	ToUserPermissionsArrayOutputWithContext(context.Context) UserPermissionsArrayOutput
}

type UserPermissionsArray []UserPermissionsInput

func (UserPermissionsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserPermissions)(nil)).Elem()
}

func (i UserPermissionsArray) ToUserPermissionsArrayOutput() UserPermissionsArrayOutput {
	return i.ToUserPermissionsArrayOutputWithContext(context.Background())
}

func (i UserPermissionsArray) ToUserPermissionsArrayOutputWithContext(ctx context.Context) UserPermissionsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserPermissionsArrayOutput)
}

// UserPermissionsMapInput is an input type that accepts UserPermissionsMap and UserPermissionsMapOutput values.
// You can construct a concrete instance of `UserPermissionsMapInput` via:
//
//	UserPermissionsMap{ "key": UserPermissionsArgs{...} }
type UserPermissionsMapInput interface {
	pulumi.Input

	ToUserPermissionsMapOutput() UserPermissionsMapOutput
	ToUserPermissionsMapOutputWithContext(context.Context) UserPermissionsMapOutput
}

type UserPermissionsMap map[string]UserPermissionsInput

func (UserPermissionsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserPermissions)(nil)).Elem()
}

func (i UserPermissionsMap) ToUserPermissionsMapOutput() UserPermissionsMapOutput {
	return i.ToUserPermissionsMapOutputWithContext(context.Background())
}

func (i UserPermissionsMap) ToUserPermissionsMapOutputWithContext(ctx context.Context) UserPermissionsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(UserPermissionsMapOutput)
}

type UserPermissionsOutput struct{ *pulumi.OutputState }

func (UserPermissionsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**UserPermissions)(nil)).Elem()
}

func (o UserPermissionsOutput) ToUserPermissionsOutput() UserPermissionsOutput {
	return o
}

func (o UserPermissionsOutput) ToUserPermissionsOutputWithContext(ctx context.Context) UserPermissionsOutput {
	return o
}

// List of API permissions granted to the user.
func (o UserPermissionsOutput) Permissions() UserPermissionsPermissionArrayOutput {
	return o.ApplyT(func(v *UserPermissions) UserPermissionsPermissionArrayOutput { return v.Permissions }).(UserPermissionsPermissionArrayOutput)
}

// ID of the user to associate the permission to.
func (o UserPermissionsOutput) UserId() pulumi.StringOutput {
	return o.ApplyT(func(v *UserPermissions) pulumi.StringOutput { return v.UserId }).(pulumi.StringOutput)
}

type UserPermissionsArrayOutput struct{ *pulumi.OutputState }

func (UserPermissionsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*UserPermissions)(nil)).Elem()
}

func (o UserPermissionsArrayOutput) ToUserPermissionsArrayOutput() UserPermissionsArrayOutput {
	return o
}

func (o UserPermissionsArrayOutput) ToUserPermissionsArrayOutputWithContext(ctx context.Context) UserPermissionsArrayOutput {
	return o
}

func (o UserPermissionsArrayOutput) Index(i pulumi.IntInput) UserPermissionsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *UserPermissions {
		return vs[0].([]*UserPermissions)[vs[1].(int)]
	}).(UserPermissionsOutput)
}

type UserPermissionsMapOutput struct{ *pulumi.OutputState }

func (UserPermissionsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*UserPermissions)(nil)).Elem()
}

func (o UserPermissionsMapOutput) ToUserPermissionsMapOutput() UserPermissionsMapOutput {
	return o
}

func (o UserPermissionsMapOutput) ToUserPermissionsMapOutputWithContext(ctx context.Context) UserPermissionsMapOutput {
	return o
}

func (o UserPermissionsMapOutput) MapIndex(k pulumi.StringInput) UserPermissionsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *UserPermissions {
		return vs[0].(map[string]*UserPermissions)[vs[1].(string)]
	}).(UserPermissionsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*UserPermissionsInput)(nil)).Elem(), &UserPermissions{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserPermissionsArrayInput)(nil)).Elem(), UserPermissionsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*UserPermissionsMapInput)(nil)).Elem(), UserPermissionsMap{})
	pulumi.RegisterOutputType(UserPermissionsOutput{})
	pulumi.RegisterOutputType(UserPermissionsArrayOutput{})
	pulumi.RegisterOutputType(UserPermissionsMapOutput{})
}
